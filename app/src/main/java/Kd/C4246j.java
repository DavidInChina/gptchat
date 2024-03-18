package kd;

import cd.C2393c;
import com.google.android.gms.internal.play_billing.N;
import gb.B;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.z;
import l8.AbstractC4344b;
import me.C4634g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import se.C5620b;

/* renamed from: kd.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4246j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37315Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ int f37316Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37317h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ z f37318i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f37319j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ A f37320k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4246j(C4255s c4255s, z zVar, String str, A a5, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37317h0 = c4255s;
        this.f37318i0 = zVar;
        this.f37319j0 = str;
        this.f37320k0 = a5;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4246j c4246j = new C4246j(this.f37317h0, this.f37318i0, this.f37319j0, this.f37320k0, abstractC4825e);
        c4246j.f37316Z = ((Number) obj).intValue();
        return c4246j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4246j) create(Integer.valueOf(((Number) obj).intValue()), (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Object obj2 = EnumC5000a.f41328Y;
        int i11 = this.f37315Y;
        Object obj3 = jf.y.f36177a;
        C4255s c4255s = this.f37317h0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    N.B0(obj);
                    return obj3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f37316Z;
            N.B0(obj);
        } else {
            N.B0(obj);
            i10 = this.f37316Z;
            if (i10 > 0) {
                bd.d dVar = c4255s.f37351d;
                this.f37316Z = i10;
                this.f37315Y = 1;
                if (L4.a.n0(((C2393c) dVar).f26591d, new AbstractC5163j(2, null), this) == obj2) {
                    return obj2;
                }
            }
        }
        this.f37318i0.f37647Y = i10;
        ge.d dVar2 = c4255s.f37352e;
        C4245i c4245i = new C4245i(c4255s, this.f37320k0, null);
        this.f37315Y = 2;
        Object u12 = AbstractC4344b.u1(dVar2, new C4634g(1, new B(this.f37319j0, C5620b.f45553Y)), c4245i, this);
        Object obj4 = u12;
        if (u12 != obj2) {
            obj4 = obj3;
        }
        if (obj4 != obj2) {
            obj4 = obj3;
        }
        if (obj4 == obj2) {
            return obj2;
        }
        return obj3;
    }
}
