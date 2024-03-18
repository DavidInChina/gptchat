package cc;

import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6189g;
import wd.C6205s;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f26572Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f26573Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f26573Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new h(this.f26573Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((h) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r6 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r6 == r1) goto L25;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26572Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f26572Y = 1;
            i iVar = this.f26573Z;
            o oVar = (o) iVar.e();
            if (oVar instanceof k) {
                k kVar = (k) oVar;
                kVar.getClass();
                boolean y02 = Ad.l.y0(kVar);
                xd.e eVar = kVar.f26578a;
                if (y02) {
                    obj2 = iVar.m(eVar, this);
                } else {
                    List<C6205s> list = eVar.f49810b;
                    ArrayList arrayList = new ArrayList();
                    for (C6205s c6205s : list) {
                        C6189g c6189g = c6205s.f48457a;
                        if (c6189g != null) {
                            arrayList.add(c6189g);
                        }
                    }
                    obj2 = iVar.n(arrayList, this);
                    EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                    if (obj2 != enumC5000a2) {
                        obj2 = yVar;
                    }
                }
            }
            obj2 = yVar;
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
