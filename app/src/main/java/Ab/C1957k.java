package ab;

import Z.AbstractC1710f0;
import cb.C2332A;
import cb.C2379t;
import wf.AbstractC6216a;

/* renamed from: ab.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957k extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24110Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f24111Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Wa.m f24112h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2379t f24113i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f24114j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f24115k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1957k(wf.k kVar, Wa.m mVar, C2379t c2379t, String str, AbstractC1710f0 abstractC1710f0, int i10) {
        super(0);
        this.f24110Y = i10;
        this.f24111Z = kVar;
        this.f24112h0 = mVar;
        this.f24113i0 = c2379t;
        this.f24114j0 = str;
        this.f24115k0 = abstractC1710f0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        C2332A c2332a;
        C2332A c2332a2;
        int i10 = this.f24110Y;
        wf.k kVar = this.f24111Z;
        String str = this.f24114j0;
        String str2 = null;
        C2379t c2379t = this.f24113i0;
        Wa.m mVar = this.f24112h0;
        AbstractC1710f0 abstractC1710f0 = this.f24115k0;
        switch (i10) {
            case 0:
                abstractC1710f0.setValue(Boolean.FALSE);
                String str3 = mVar.f20857a;
                if (c2379t != null && (c2332a = c2379t.f26551c) != null) {
                    str2 = c2332a.f26425b;
                }
                kVar.invoke(new C1963q(str3, str2, str, Wa.n.f20862Z));
                return;
            default:
                abstractC1710f0.setValue(Boolean.FALSE);
                String str4 = mVar.f20857a;
                if (c2379t != null && (c2332a2 = c2379t.f26551c) != null) {
                    str2 = c2332a2.f26425b;
                }
                kVar.invoke(new C1963q(str4, str2, str, Wa.n.f20861Y));
                return;
        }
    }
}
