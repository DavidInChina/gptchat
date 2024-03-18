package n9;

import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;

/* renamed from: n9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4723b extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4723b f39657Z = new C4723b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4723b f39658h0 = new C4723b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4723b f39659i0 = new C4723b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4723b f39660j0 = new C4723b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C4723b f39661k0 = new C4723b(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39662Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4723b(int i10) {
        super(1);
        this.f39662Y = i10;
    }

    public final void a(wf.k kVar) {
        switch (this.f39662Y) {
            case 0:
                AbstractC3557B.c0("emit", kVar);
                kVar.invoke("DBConversation");
                kVar.invoke("DBMessage");
                return;
            case 1:
                AbstractC3557B.c0("emit", kVar);
                kVar.invoke("DBConversation");
                kVar.invoke("DBMessage");
                return;
            case 2:
                AbstractC3557B.c0("emit", kVar);
                kVar.invoke("DBConversation");
                return;
            case 3:
                AbstractC3557B.c0("emit", kVar);
                kVar.invoke("DBMessage");
                return;
            default:
                AbstractC3557B.c0("emit", kVar);
                kVar.invoke("DBMessage");
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f39662Y) {
            case 0:
                a((wf.k) obj);
                return yVar;
            case 1:
                a((wf.k) obj);
                return yVar;
            case 2:
                a((wf.k) obj);
                return yVar;
            case 3:
                a((wf.k) obj);
                return yVar;
            default:
                a((wf.k) obj);
                return yVar;
        }
    }
}
