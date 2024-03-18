package o9;

import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.M;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: o9.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4957e implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40993Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f40994Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f40995h0;

    public /* synthetic */ C4957e(AbstractC1206i abstractC1206i, wf.n nVar, int i10) {
        this.f40993Y = i10;
        this.f40994Z = abstractC1206i;
        this.f40995h0 = nVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.internal.x] */
    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f40993Y;
        AbstractC1206i abstractC1206i = this.f40994Z;
        wf.n nVar = this.f40995h0;
        switch (i10) {
            case 0:
                Object b10 = abstractC1206i.b(new C4956d(abstractC1207j, nVar, 0), abstractC4825e);
                if (b10 == EnumC5000a.f41328Y) {
                    return b10;
                }
                return yVar;
            case 1:
                Object b11 = abstractC1206i.b(new M(new Object(), abstractC1207j, nVar), abstractC4825e);
                if (b11 == EnumC5000a.f41328Y) {
                    return b11;
                }
                return yVar;
            default:
                Object b12 = abstractC1206i.b(new C4956d(abstractC1207j, nVar, 1), abstractC4825e);
                if (b12 == EnumC5000a.f41328Y) {
                    return b12;
                }
                return yVar;
        }
    }
}
