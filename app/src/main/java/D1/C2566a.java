package d1;

import Z.N;
import g.AbstractC3126s;
import h.C3277c;
import jf.y;

/* renamed from: d1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2566a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27845Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ DialogC2582q f27846Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2566a(DialogC2582q dialogC2582q, int i10) {
        super(1);
        this.f27845Y = i10;
        this.f27846Z = dialogC2582q;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f27845Y;
        DialogC2582q dialogC2582q = this.f27846Z;
        switch (i10) {
            case 0:
                N n10 = (N) obj;
                dialogC2582q.show();
                return new C3277c(8, dialogC2582q);
            default:
                AbstractC3126s abstractC3126s = (AbstractC3126s) obj;
                if (dialogC2582q.f27890j0.f27884a) {
                    dialogC2582q.f27889i0.mo122invoke();
                }
                return y.f36177a;
        }
    }
}
