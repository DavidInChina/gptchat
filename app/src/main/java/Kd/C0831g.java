package Kd;

import com.google.android.gms.internal.play_billing.N;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Kd.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0831g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C0832h f9735Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f9736Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f9737h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9738i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f9739j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0832h f9740k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f9741l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0831g(List list, C0832h c0832h, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9739j0 = list;
        this.f9740k0 = c0832h;
        this.f9741l0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0831g(this.f9739j0, this.f9740k0, this.f9741l0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0831g) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C0832h c0832h;
        Iterator it;
        int i10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f9738i0;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f9737h0;
                it = this.f9736Z;
                c0832h = this.f9735Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Iterator it2 = this.f9739j0.iterator();
            c0832h = this.f9740k0;
            i10 = this.f9741l0;
            it = it2;
        }
        while (it.hasNext()) {
            c0832h.f9743b.invoke((byte[]) it.next());
            this.f9735Y = c0832h;
            this.f9736Z = it;
            this.f9737h0 = i10;
            this.f9738i0 = 1;
            if (R4.b.p0(i10 / 2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
