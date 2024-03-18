package x3;

import S8.C1371o;
import Z.AbstractC1710f0;
import android.content.ContentValues;
import h0.C3288a;
import id.AbstractC3557B;
import id.C3556A;
import id.C3571k;
import y.C6475m;

/* renamed from: x3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6271a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48663Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f48664Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f48665h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f48666i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f48667j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f48668k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6271a(int i10, id.x xVar, C3556A c3556a, wf.k kVar, AbstractC1710f0 abstractC1710f0) {
        super(1);
        this.f48664Z = i10;
        this.f48665h0 = xVar;
        this.f48666i0 = c3556a;
        this.f48667j0 = kVar;
        this.f48668k0 = abstractC1710f0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f48663Y;
        Object obj2 = this.f48668k0;
        Object obj3 = this.f48667j0;
        Object obj4 = this.f48666i0;
        Object obj5 = this.f48665h0;
        switch (i10) {
            case 0:
                B3.b bVar = (B3.b) obj;
                AbstractC3557B.c0("db", bVar);
                return Integer.valueOf(bVar.Y((String) obj5, this.f48664Z, (ContentValues) obj3, (String) obj4, (Object[]) obj2));
            default:
                de.m mVar = (de.m) obj;
                AbstractC3557B.c0("$this$LazyTable", mVar);
                C3571k c3571k = C3571k.f33104i0;
                id.x xVar = (id.x) obj5;
                C3556A c3556a = (C3556A) obj4;
                wf.k kVar = (wf.k) obj3;
                C3288a c3288a = new C3288a(new C6475m(xVar, c3556a, kVar, (AbstractC1710f0) obj2, 11), true, -1751467101);
                int i11 = this.f48664Z;
                Ad.l.M0(mVar, i11, c3571k, c3288a);
                int i12 = xVar.f33135d;
                Ad.l.M0(mVar, (xVar.f33137f * i12) + i12, new C6272b(i11, 1), new C3288a(new C1371o(i11, xVar, c3556a, kVar), true, 224759628));
                return jf.y.f36177a;
        }
    }
}
