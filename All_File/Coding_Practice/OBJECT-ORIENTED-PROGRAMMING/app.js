const cards = document.querySelectorAll('.card');
const prevBtn = document.querySelector('.prev-btn');
const nextBtn = document.querySelector('.next-btn');

let currentCardIndex = 0;

function showCard(index) {
  cards.forEach(card => card.classList.remove('active'));
  cards[index].classList.add('active');
}

prevBtn.addEventListener('click', () => {
  currentCardIndex = (currentCardIndex - 1 + cards.length) % cards.length;
  showCard(currentCardIndex);
});

nextBtn.addEventListener('click', () => {
  currentCardIndex = (currentCardIndex + 1) % cards.length;
  showCard(currentCardIndex);
});

// Show the initial card
showCard(currentCardIndex);
