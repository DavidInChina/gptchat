package M1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: M1.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0926g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Iterator f11438Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f11439Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f11440h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f11441i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f11442j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ List f11443k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0926g(List list, List list2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11442j0 = list;
        this.f11443k0 = list2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0926g c0926g = new C0926g(this.f11442j0, this.f11443k0, abstractC4825e);
        c0926g.f11441i0 = obj;
        return c0926g;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0926g) create(obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11440h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f11438Y;
                    list = (List) this.f11441i0;
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f11439Z;
                Iterator it2 = this.f11438Y;
                List list2 = (List) this.f11441i0;
                N.B0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new AbstractC5163j(1, null));
                    this.f11441i0 = list2;
                    this.f11438Y = it2;
                    this.f11439Z = null;
                    this.f11440h0 = 2;
                    throw null;
                }
            }
        } else {
            N.B0(obj);
            obj = this.f11441i0;
            it = this.f11442j0.iterator();
            list = this.f11443k0;
        }
        if (!it.hasNext()) {
            return obj;
        }
        AbstractC2469q0.p(it.next());
        this.f11441i0 = list;
        this.f11438Y = it;
        this.f11439Z = obj;
        this.f11440h0 = 1;
        throw null;
    }
}
