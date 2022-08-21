package kr.irang.baccarat;

public enum Questions {
    Q_Continue(null),
    Q_BettingSide(null);

    private QuestionProvider provider;

    Questions(QuestionProvider provider) {
        this.provider = provider;
    }

    public void setProvider(QuestionProvider provider) {
        this.provider = provider;
    }

    public QuestionProvider getProvider() {
        return provider;
    }
}
