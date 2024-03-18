package A2;

/* renamed from: A2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0063g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f551a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f552b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f553c;

    public C0063g(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f551a = false;
        this.f552b = false;
        this.f553c = false;
    }

    public final C0064h a() {
        if (!this.f551a && (this.f552b || this.f553c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new C0064h(this);
    }
}
