package La;

import Ad.l;
import Ng.AbstractC1073l0;
import Ng.F;
import Pc.e;
import com.google.android.gms.internal.play_billing.N;
import f9.s;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jf.y;
import ka.C4206b;
import kf.x;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import x8.W;

/* loaded from: classes.dex */
public final class b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10964Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f10965Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f10966h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ c f10967i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j6, c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10966h0 = j6;
        this.f10967i0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        b bVar = new b(this.f10966h0, this.f10967i0, abstractC4825e);
        bVar.f10965Z = obj;
        return bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CancellationException e10;
        F f6;
        AbstractC1073l0 parent;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10964Y;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (F) this.f10965Z;
                try {
                    N.B0(obj);
                } catch (CancellationException e11) {
                    e10 = e11;
                    parent = L4.a.y0(f6).getParent();
                    if (parent != null) {
                        throw e10;
                    }
                    cVar = this.f10967i0;
                    synchronized (cVar) {
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f10 = (F) this.f10965Z;
            try {
                long j6 = this.f10966h0;
                this.f10965Z = f10;
                this.f10964Y = 1;
                if (R4.b.q0(j6, this) == enumC5000a) {
                    return enumC5000a;
                }
            } catch (CancellationException e12) {
                f6 = f10;
                e10 = e12;
                parent = L4.a.y0(f6).getParent();
                if (parent != null && parent.a()) {
                    throw e10;
                }
                cVar = this.f10967i0;
                synchronized (cVar) {
                }
            }
        }
        cVar = this.f10967i0;
        synchronized (cVar) {
            Iterator it = cVar.f10971c.entrySet().iterator();
            while (it.hasNext()) {
                Z9.a aVar = (Z9.a) ((Map.Entry) it.next()).getKey();
                Collection collection = (Set) cVar.f10971c.get(aVar);
                if (collection == null) {
                    collection = x.f37485Y;
                }
                if (!(!collection.isEmpty())) {
                    AbstractC3557B.a0("null cannot be cast to non-null type com.openai.feature.conversations.tangled.impl.di.ConversationComponentManagerBindings", aVar);
                    l.P(((s) ((Z3.b) aVar)).f29940a, null);
                    Pc.c a5 = e.a();
                    W.M(a5, "Removing conversation component for " + ((List) ((C4206b) ((T9.d) ((s) ((Z3.b) aVar)).f29948i.get())).f37209b.getValue()), null, 6);
                    it.remove();
                }
            }
        }
        return y.f36177a;
    }
}
