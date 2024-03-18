package e9;

import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import pd.r;
import pd.s;

/* renamed from: e9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2809b extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2809b f29045Z = new C2809b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2809b f29046h0 = new C2809b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2809b f29047i0 = new C2809b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29048Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2809b(int i10) {
        super(1);
        this.f29048Y = i10;
    }

    public final s a(s sVar) {
        switch (this.f29048Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", sVar);
                return pd.k.f43062a;
            case 1:
                AbstractC3557B.c0("$this$setState", sVar);
                return r.f43069a;
            default:
                AbstractC3557B.c0("$this$setState", sVar);
                return pd.l.f43063a;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f29048Y) {
            case 0:
                return a((s) obj);
            case 1:
                return a((s) obj);
            default:
                return a((s) obj);
        }
    }
}
