package i0;

import Ng.F;
import Z.l1;
import Z8.AbstractC1809m0;
import Z8.O0;
import android.content.Context;
import id.AbstractC3557B;
import kb.AbstractC4208B;
import kb.C4209C;
import kb.z;
import kf.w;
import wf.AbstractC6216a;

/* renamed from: i0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3455b extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32394Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f32395Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f32396h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f32397i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f32398j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f32399k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f32400l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3455b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(0);
        this.f32394Y = i10;
        this.f32395Z = obj;
        this.f32396h0 = obj2;
        this.f32397i0 = obj3;
        this.f32398j0 = obj4;
        this.f32399k0 = obj5;
        this.f32400l0 = obj6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        boolean z10;
        int i10 = this.f32394Y;
        Object obj = this.f32400l0;
        Object obj2 = this.f32399k0;
        Object obj3 = this.f32398j0;
        Object obj4 = this.f32397i0;
        Object obj5 = this.f32395Z;
        Object obj6 = this.f32396h0;
        switch (i10) {
            case 0:
                d dVar = (d) obj5;
                q qVar = (q) obj6;
                m mVar = (m) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                boolean z11 = true;
                if (dVar.f32403Z != mVar) {
                    dVar.f32403Z = mVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!AbstractC3557B.K(dVar.f32404h0, str)) {
                    dVar.f32404h0 = str;
                } else {
                    z11 = z10;
                }
                dVar.f32402Y = qVar;
                dVar.f32405i0 = obj2;
                dVar.f32406j0 = objArr;
                l lVar = dVar.f32407k0;
                if (lVar == null || !z11) {
                    return;
                }
                ((n) lVar).a();
                dVar.f32407k0 = null;
                dVar.b();
                return;
            default:
                AbstractC1809m0.a().b(O0.f23265c, w.f37484Y);
                float f6 = AbstractC4208B.f37219b;
                if (!((Boolean) ((l1) obj6).getValue()).booleanValue()) {
                    return;
                }
                Ad.l.O0((F) obj5, null, null, new z((x9.l) obj4, (C4209C) obj3, (Context) obj2, (wf.k) obj, null), 3);
                return;
        }
    }
}
