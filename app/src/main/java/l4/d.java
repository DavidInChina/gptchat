package l4;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import k4.C4172n;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37771Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f37772Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B f37773h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ B f37774i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ q4.j f37775j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f37776k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ B f37777l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ f4.e f37778m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, B b10, B b11, q4.j jVar, Object obj, B b12, f4.e eVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37772Z = iVar;
        this.f37773h0 = b10;
        this.f37774i0 = b11;
        this.f37775j0 = jVar;
        this.f37776k0 = obj;
        this.f37777l0 = b12;
        this.f37778m0 = eVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f37772Z, this.f37773h0, this.f37774i0, this.f37775j0, this.f37776k0, this.f37777l0, this.f37778m0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37771Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f37771Y = 1;
            obj = i.a(this.f37772Z, (C4172n) this.f37773h0.f37622Y, (f4.c) this.f37774i0.f37622Y, this.f37775j0, this.f37776k0, (q4.n) this.f37777l0.f37622Y, this.f37778m0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
