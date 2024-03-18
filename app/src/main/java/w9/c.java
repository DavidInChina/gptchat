package W9;

import com.google.android.gms.internal.play_billing.N;
import d4.AbstractC2597f;
import d4.C2595d;
import e4.C2801i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f20830Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f20831Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f20832h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2597f f20833i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j6, long j10, AbstractC2597f abstractC2597f, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f20831Z = j6;
        this.f20832h0 = j10;
        this.f20833i0 = abstractC2597f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new c(this.f20831Z, this.f20832h0, this.f20833i0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((c) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2595d a5;
        C2595d a10;
        C2595d a11;
        C2595d a12;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20830Y;
        AbstractC2597f abstractC2597f = this.f20833i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            N.B0(obj);
                            return y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                    a5 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                    this.f20830Y = 4;
                    if (a5.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    return y.f36177a;
                }
                N.B0(obj);
            } else {
                N.B0(obj);
                a11 = ((C2801i) abstractC2597f).a(null, "CREATE TABLE DBMessage (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversationId TEXT NOT NULL,\n    messageNode TEXT NOT NULL,\n    FOREIGN KEY (conversationId)\n       REFERENCES DBConversation (id)\n       ON DELETE CASCADE\n       ON UPDATE RESTRICT\n)", null);
                this.f20830Y = 2;
                if (a11.f27991b == enumC5000a) {
                    return enumC5000a;
                }
            }
        } else {
            N.B0(obj);
            if (this.f20831Z <= 1 && this.f20832h0 > 1) {
                a12 = ((C2801i) abstractC2597f).a(null, "DELETE FROM DBConversation", null);
                this.f20830Y = 1;
                if (a12.f27991b == enumC5000a) {
                    return enumC5000a;
                }
                a11 = ((C2801i) abstractC2597f).a(null, "CREATE TABLE DBMessage (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversationId TEXT NOT NULL,\n    messageNode TEXT NOT NULL,\n    FOREIGN KEY (conversationId)\n       REFERENCES DBConversation (id)\n       ON DELETE CASCADE\n       ON UPDATE RESTRICT\n)", null);
                this.f20830Y = 2;
                if (a11.f27991b == enumC5000a) {
                }
            }
            return y.f36177a;
        }
        a10 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_id ON DBMessage(id)", null);
        this.f20830Y = 3;
        if (a10.f27991b == enumC5000a) {
            return enumC5000a;
        }
        a5 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
        this.f20830Y = 4;
        if (a5.f27991b == enumC5000a) {
        }
        return y.f36177a;
    }
}
