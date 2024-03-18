package ob;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import f9.C2958j;
import id.AbstractC3557B;
import jf.y;
import kb.C4221f;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f41217Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41218Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41218Z = lVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        e eVar = new e(this.f41218Z, abstractC4825e);
        eVar.f41217Y = obj;
        return eVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((e) create((Uri) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        l lVar = this.f41218Z;
        lVar.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", (Uri) this.f41217Y);
        intent.setType("image/*");
        Intent createChooser = Intent.createChooser(intent, ((C2958j) lVar.f41236n).a(R.string.conversations_image_share_intent));
        AbstractC3557B.b0("createChooser(...)", createChooser);
        lVar.f(new C4221f(createChooser));
        return y.f36177a;
    }
}
