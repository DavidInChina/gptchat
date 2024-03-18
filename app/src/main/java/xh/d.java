package xh;

/* loaded from: classes2.dex */
public enum d implements AbstractC6459b {
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(1024),
    /* JADX INFO: Fake field, exist only in values array */
    INTERFACE(1536),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOTATION(9728);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f50061Y;

    d(int i10) {
        this.f50061Y = i10;
    }

    @Override // xh.c
    public final int a() {
        return this.f50061Y;
    }

    @Override // xh.c
    public final int b() {
        return 9744;
    }
}
