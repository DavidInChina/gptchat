package s3;

import android.content.Context;
import android.content.ContextWrapper;
import id.AbstractC3557B;

/* renamed from: s3.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5552b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5552b f45281Z = new C5552b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5552b f45282h0 = new C5552b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5552b f45283i0 = new C5552b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5552b f45284j0 = new C5552b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C5552b f45285k0 = new C5552b(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C5552b f45286l0 = new C5552b(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C5552b f45287m0 = new C5552b(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C5552b f45288n0 = new C5552b(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C5552b f45289o0 = new C5552b(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C5552b f45290p0 = new C5552b(9);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45291Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5552b(int i10) {
        super(1);
        this.f45291Y = i10;
    }

    public final Context a(Context context) {
        switch (this.f45291Y) {
            case 0:
                AbstractC3557B.c0("it", context);
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            default:
                AbstractC3557B.c0("it", context);
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
        }
    }

    public final AbstractC5540C c(AbstractC5540C abstractC5540C) {
        switch (this.f45291Y) {
            case 3:
                AbstractC3557B.c0("destination", abstractC5540C);
                C5542E c5542e = abstractC5540C.f45216Z;
                if (c5542e == null || c5542e.f45228p0 != abstractC5540C.f45221l0) {
                    return null;
                }
                return c5542e;
            case 4:
                AbstractC3557B.c0("destination", abstractC5540C);
                C5542E c5542e2 = abstractC5540C.f45216Z;
                if (c5542e2 == null || c5542e2.f45228p0 != abstractC5540C.f45221l0) {
                    return null;
                }
                return c5542e2;
            case 5:
            case 6:
            default:
                AbstractC3557B.c0("it", abstractC5540C);
                if (!(abstractC5540C instanceof C5542E)) {
                    return null;
                }
                C5542E c5542e3 = (C5542E) abstractC5540C;
                return c5542e3.U(c5542e3.f45228p0, true);
            case 7:
                AbstractC3557B.c0("it", abstractC5540C);
                return abstractC5540C.f45216Z;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f45291Y;
        switch (i10) {
            case 0:
                return a((Context) obj);
            case 1:
                return a((Context) obj);
            case 2:
                C5549L c5549l = (C5549L) obj;
                switch (i10) {
                    case 2:
                        AbstractC3557B.c0("$this$navOptions", c5549l);
                        c5549l.f45256c = true;
                        break;
                    default:
                        AbstractC3557B.c0("$this$navOptions", c5549l);
                        c5549l.f45255b = true;
                        break;
                }
                return yVar;
            case 3:
                return c((AbstractC5540C) obj);
            case 4:
                return c((AbstractC5540C) obj);
            case 5:
                C5554d c5554d = (C5554d) obj;
                AbstractC3557B.c0("$this$anim", c5554d);
                c5554d.f45293a = 0;
                c5554d.f45294b = 0;
                return yVar;
            case 6:
                Y y10 = (Y) obj;
                AbstractC3557B.c0("$this$popUpTo", y10);
                y10.f45280a = true;
                return yVar;
            case 7:
                return c((AbstractC5540C) obj);
            case 8:
                return c((AbstractC5540C) obj);
            default:
                C5549L c5549l2 = (C5549L) obj;
                switch (i10) {
                    case 2:
                        AbstractC3557B.c0("$this$navOptions", c5549l2);
                        c5549l2.f45256c = true;
                        break;
                    default:
                        AbstractC3557B.c0("$this$navOptions", c5549l2);
                        c5549l2.f45255b = true;
                        break;
                }
                return yVar;
        }
    }
}
