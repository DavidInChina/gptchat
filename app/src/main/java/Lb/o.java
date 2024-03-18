package lb;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import f9.C2958j;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f38049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38050Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(K k10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f38050Z = k10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        o oVar = new o(this.f38050Z, abstractC4825e);
        oVar.f38049Y = obj;
        return oVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((o) create((Uri) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        K k10 = this.f38050Z;
        k10.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", (Uri) this.f38049Y);
        intent.setType("image/*");
        Intent createChooser = Intent.createChooser(intent, ((C2958j) k10.f37963s).a(R.string.conversations_image_share_intent));
        AbstractC3557B.b0("createChooser(...)", createChooser);
        k10.f(new gb.H(createChooser));
        return jf.y.f36177a;
    }
}
