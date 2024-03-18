package A9;

import Lg.i;
import id.AbstractC3557B;
import wf.k;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements N7.d {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f731Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f732Z;

    public /* synthetic */ b(int i10, k kVar) {
        this.f731Y = i10;
        this.f732Z = kVar;
    }

    @Override // N7.d
    public final void a(Object obj) {
        int i10 = this.f731Y;
        k kVar = this.f732Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$tmp0", kVar);
                kVar.invoke(obj);
                return;
            case 1:
                kVar.invoke(obj);
                return;
            default:
                i iVar = Lb.c.f10979a;
                AbstractC3557B.c0("$tmp0", kVar);
                kVar.invoke(obj);
                return;
        }
    }
}
