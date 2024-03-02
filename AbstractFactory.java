interface ButtonFactory{
    Button createButton();
}

interface Button{
    void render();
    void onPressed();
}
