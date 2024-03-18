function renderLatex(latexBase64, textColor) {
  document.body.style.color = textColor;
  const latex = atob(latexBase64);
  katex.render(latex, document.body, {
    throwOnError: true,
  });
}
