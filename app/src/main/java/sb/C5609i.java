package sb;

import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: sb.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5609i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f45509Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f45510Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5609i(Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45510Z = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5609i c5609i = new C5609i(this.f45510Z, abstractC4825e);
        c5609i.f45509Y = obj;
        return c5609i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C5609i) create((n) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        n nVar = (n) this.f45509Y;
        if (nVar instanceof m) {
            ((m) nVar).getClass();
            Tc.f.b(this.f45510Z, R.string.conversation_thanks_for_feedback);
        }
        return y.f36177a;
    }
}
