

alert("Click or touch anywhere on the screen and watch the show!");

function fpsObject() {
  this.fps = 60;
  this.ads = 1;
  this.lastFrame = performance.now();

  this.update = () => {
    let delT = performance.now() - this.lastFrame;
    this.fps = 1000 / delT;
    this.lastFrame = performance.now();
    this.ads = delT / (1000 / 60);
  };
}

const cOb = {};
const fps = new fpsObject();

const init = () => {
  cOb.c = q("canvas");
  let dpr = window.devicePixelRatio || 1;
  cOb.w = cOb.c.width = window.innerWidth;
  cOb.h = cOb.c.height = window.innerHeight;
  cOb.ctx = cOb.c.getContext("2d");
  loop();

  cOb.c.addEventListener("click", (e) => {
    let rect = cOb.c.getBoundingClientRect();
    new fw(
      e.clientX - rect.left,
      e.clientY - rect.top,
      125 + 50 * Math.random()
    );
  });
};

function loop() {
  cOb.ctx.clearRect(0, 0, cOb.w, cOb.h);
  fps.update();
  window.requestAnimationFrame(loop);
}

function fw(x, y, rad) {
  this.boom = false;
  this.cx = cOb.w * Math.random();
  this.cy = cOb.h;
  this.bx = x;
  this.by = y;
  this.rad = rad;
  this.curv = -1 + 2 * Math.random();

  this.draw = () => {
    if (!this.boom) {
      for (let i = 0; i <= 3; i++) {
        let x = this.cx + (-1 + 2 * Math.random());
        let y = this.cy + (-1 + 2 * Math.random());
        new spark(
          x,
          y,
          3 + 1 * Math.random(),
          x + (-7 + 14 * Math.random()),
          y + (-2 + 4 * Math.random())
        );
      }
      this.update();
    } else {
      for (let i = 0; i <= 300; i++) {
        let a = Math.random() * 2 * Math.PI;
        let r = this.rad * Math.random();
        let x = this.cx + Math.cos(a) * r;
        let y = this.cy + Math.sin(a) * r;
        new spark(this.cx, this.cy, 5 + 2 * Math.random(), x, y);
      }
    }
  };

  this.update = () => {
    if (dist(this.cx, this.cy, this.bx, this.by) <= 10) {
      this.boom = true;
    }
    this.cx +=
      0.1 * fps.ads * (this.bx - this.cx) +
      this.curv *
        Math.sin(((this.cy - this.by) / (cOb.h - this.by)) * 4 * Math.PI);
    this.cy += 0.1 * fps.ads * (this.by - this.cy);

    window.requestAnimationFrame(this.draw);
  };

  this.draw();
}

function spark(ix, iy, r, fx, fy) {
  this.x = ix;
  this.y = iy;
  this.fx = fx - ix;
  this.fy = fy - iy;
  this.r = 100 + 155 * Math.random();
  this.g = 100 + 155 * Math.random();
  this.b = 100 + 155 * Math.random();
  this.a = 1;
  this.rad = r;
  this.rot = Math.random() * 2 * Math.PI;
  this.rs = 0.075 + 0.075 * Math.random();
  this.rd = Math.random() > 0.5 ? 1 : -1;

  this.draw = () => {
    let { r, g, b, a, x, y, rad, rot } = this;
    let points = [
      [-1 * rad, -0.25 * rad],
      [-0.25 * rad, -0.25 * rad],
      [0, -1 * rad],
      [0.25 * rad, -0.25 * rad],
      [1 * rad, -0.25 * rad],
      [0.35 * rad, 0.25 * rad],
      [0.75 * rad, 1 * rad],
      [0, 0.5 * rad],
      [-0.75 * rad, 1 * rad],
      [-0.35 * rad, 0.25 * rad],
    ];

    cOb.ctx.fillStyle = `rgba(${r},${g},${b},${a}`;
    cOb.ctx.beginPath();
    points.forEach((p, i) => {
      let nx = p[0] * Math.cos(rot) - p[1] * Math.sin(rot);
      let ny = p[0] * Math.sin(rot) + p[1] * Math.cos(rot);
      p[0] = nx;
      p[1] = ny;
      if (i == 0) {
        cOb.ctx.moveTo(x + p[0], y + p[1]);
      } else {
        cOb.ctx.lineTo(x + p[0], y + p[1]);
      }
    });
    cOb.ctx.closePath();
    cOb.ctx.fill();

    this.update();
  };

  this.update = () => {
    this.fx *= 0.99;
    this.fy += 2;
    this.x += 0.075 * this.fx * fps.ads;
    this.y += 0.075 * this.fy * fps.ads;
    this.a -= 0.015 * fps.ads;
    this.rad *= 0.999;
    this.rot += this.rd * this.rs * fps.ads;
    if (this.a > 0) {
      window.requestAnimationFrame(this.draw);
    }
  };

  this.draw();
}

function dist(x1, y1, x2, y2) {
  return Math.hypot(x1 - x2, y1 - y2);
}

const q = document.querySelector.bind(document);
window.onload = init;
