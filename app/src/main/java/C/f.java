package C;

import B.AbstractC0130h1;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6716p;

/* loaded from: classes.dex */
public final class f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public y f2445Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2446Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f2447h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f2448i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f2449j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0130h1 f2450k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(float f6, AbstractC0130h1 abstractC0130h1, j jVar, AbstractC4825e abstractC4825e, wf.k kVar) {
        super(2, abstractC4825e);
        this.f2447h0 = jVar;
        this.f2448i0 = f6;
        this.f2449j0 = kVar;
        this.f2450k0 = abstractC0130h1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        wf.k kVar = this.f2449j0;
        return new f(this.f2448i0, this.f2450k0, this.f2447h0, abstractC4825e, kVar);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        y yVar;
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2446Z;
        wf.k kVar = this.f2449j0;
        j jVar = this.f2447h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y yVar2 = this.f2445Y;
            N.B0(obj);
            yVar = yVar2;
            obj2 = obj;
        } else {
            N.B0(obj);
            o oVar = jVar.f2458a;
            float f6 = this.f2448i0;
            float signum = Math.signum(f6) * Math.abs(oVar.a(f6));
            ?? obj3 = new Object();
            obj3.f37646Y = signum;
            kVar.invoke(new Float(signum));
            float f10 = obj3.f37646Y;
            e eVar = new e(obj3, kVar, 1);
            this.f2445Y = obj3;
            this.f2446Z = 1;
            obj2 = j.b(this.f2447h0, this.f2450k0, f10, this.f2448i0, eVar, this);
            yVar = obj3;
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        C6716p c6716p = (C6716p) obj2;
        float b10 = jVar.f2458a.b(((Number) c6716p.b()).floatValue());
        yVar.f37646Y = b10;
        C6716p l10 = AbstractC6696f.l(c6716p, 0.0f, 0.0f, 30);
        e eVar2 = new e(yVar, kVar, 0);
        this.f2445Y = null;
        this.f2446Z = 2;
        Object b11 = n.b(this.f2450k0, b10, b10, l10, jVar.f2461d, eVar2, this);
        if (b11 == enumC5000a) {
            return enumC5000a;
        }
        return b11;
    }
}
