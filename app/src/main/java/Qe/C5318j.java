package qe;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;

/* renamed from: qe.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5318j extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public StringBuilder f44103Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44104Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44105h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f44106i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C5320l f44107j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5318j(C5320l c5320l, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f44107j0 = c5320l;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C5318j c5318j = new C5318j(this.f44107j0, (AbstractC4825e) obj3);
        c5318j.f44105h0 = (Ie.e) obj;
        c5318j.f44106i0 = (AbstractC6034c) obj2;
        return c5318j.invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.StringBuilder] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        Throwable th3;
        AbstractC6034c abstractC6034c;
        C5312d c5312d;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        StringBuilder sb2 = this.f44104Z;
        y yVar = y.f36177a;
        boolean z10 = true;
        C5320l c5320l = this.f44107j0;
        try {
            if (sb2 != 0) {
                if (sb2 != 1) {
                    if (sb2 != 2) {
                        if (sb2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f44105h0;
                        N.B0(obj);
                        throw th2;
                    }
                    N.B0(obj);
                    return yVar;
                }
                StringBuilder sb3 = this.f44103Y;
                c5312d = (C5312d) this.f44106i0;
                abstractC6034c = (AbstractC6034c) this.f44105h0;
                N.B0(obj);
                sb2 = sb3;
            } else {
                N.B0(obj);
                Ie.e eVar = (Ie.e) this.f44105h0;
                abstractC6034c = (AbstractC6034c) this.f44106i0;
                if (c5320l.f44115b != 5 && !abstractC6034c.b().h().a(AbstractC5321m.f44119b)) {
                    c5312d = (C5312d) abstractC6034c.b().h().b(AbstractC5321m.f44118a);
                    StringBuilder sb4 = new StringBuilder();
                    AbstractC3557B.d2(sb4, abstractC6034c.b().d(), c5320l.f44115b, c5320l.f44117d);
                    Object b10 = eVar.b();
                    this.f44105h0 = abstractC6034c;
                    this.f44106i0 = c5312d;
                    this.f44103Y = sb4;
                    this.f44104Z = 1;
                    sb2 = sb4;
                    if (eVar.d(b10, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    return yVar;
                }
            }
            String sb5 = sb2.toString();
            AbstractC3557B.b0("header.toString()", sb5);
            c5312d.e(sb5);
            if (!AbstractC4194d.j(c5320l.f44115b)) {
                this.f44105h0 = null;
                this.f44106i0 = null;
                this.f44103Y = null;
                this.f44104Z = 2;
                if (c5312d.b(this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            return yVar;
        } catch (Throwable th4) {
            try {
                C5320l.b(c5320l, sb2, abstractC6034c.b().c(), th4);
                try {
                    throw th4;
                } catch (Throwable th5) {
                    th3 = th5;
                    String sb6 = sb2.toString();
                    AbstractC3557B.b0("header.toString()", sb6);
                    c5312d.e(sb6);
                    if (z10 || !AbstractC4194d.j(c5320l.f44115b)) {
                        this.f44105h0 = th3;
                        this.f44106i0 = null;
                        this.f44103Y = null;
                        this.f44104Z = 3;
                        if (c5312d.b(this) == enumC5000a) {
                            return enumC5000a;
                        }
                        th2 = th3;
                        throw th2;
                    }
                    throw th3;
                }
            } catch (Throwable th6) {
                th3 = th6;
                z10 = false;
            }
        }
    }
}
