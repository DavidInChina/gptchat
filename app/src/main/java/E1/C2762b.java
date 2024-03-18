package e1;

import id.AbstractC3557B;

/* renamed from: e1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2762b extends Throwable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28722Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2762b(int i10) {
        super("Failure occurred while trying to finish a future.");
        this.f28722Y = i10;
    }

    private synchronized void a() {
    }

    private synchronized void b() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f28722Y) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2762b(String str) {
        super(str);
        this.f28722Y = 2;
        AbstractC3557B.c0("message", str);
    }
}
