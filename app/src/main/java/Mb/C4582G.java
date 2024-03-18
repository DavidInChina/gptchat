package mb;

import Dd.EnumC0390k;
import Ng.Q;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4582G extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public String f39025Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f39026Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f39027h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4586K f39028i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C2969F f39029j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4582G(C4586K c4586k, C2969F c2969f, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f39028i0 = c4586k;
        this.f39029j0 = c2969f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4582G(this.f39028i0, this.f39029j0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4582G) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39027h0;
        C4586K c4586k = this.f39028i0;
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = this.f39026Z;
                str = this.f39025Y;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2969F c2969f = this.f39029j0;
            c4586k.l(new oa.i(c2969f, 2));
            String str4 = c2969f.f30009b;
            if (str4 == null) {
                str4 = null;
            }
            this.f39025Y = str4;
            String str5 = c2969f.f30008a;
            this.f39026Z = str5;
            this.f39027h0 = 1;
            Enum a5 = c4586k.f39042m.a(this);
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
            str2 = str5;
            str = str4;
            obj = a5;
        }
        String str6 = ((Ed.i) obj).f4682Y.f52002Y;
        if (str != null) {
            AbstractC3557B.c0("messageId", str2);
            AbstractC3557B.c0("voice", str6);
            EnumC0390k[] enumC0390kArr = EnumC0390k.f3563Y;
            str3 = R.a.t(android.gov.nist.core.a.t("https://android.chat.openai.com/backend-api/synthesize?conversation_id=", str, "&message_id=", str2, "&voice="), str6, "&format=mp3");
        } else {
            str3 = null;
        }
        Uri parse = Uri.parse(str3);
        C4603p n10 = c4586k.n();
        AbstractC3557B.Z(parse);
        n10.getClass();
        Tg.e eVar = Q.f12904a;
        Ad.l.O0(n10.f39079a, Sg.u.f16684a, null, new C4600m(n10, parse, null), 2);
        return jf.y.f36177a;
    }
}
