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
public final class a extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f20823Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2597f f20824Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractC2597f abstractC2597f, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f20824Z = abstractC2597f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new a(this.f20824Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((a) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2595d a5;
        C2595d a10;
        C2595d a11;
        C2595d a12;
        C2595d a13;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20823Y;
        AbstractC2597f abstractC2597f = this.f20824Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                N.B0(obj);
                                return y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj);
                        a5 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                        this.f20823Y = 5;
                        if (a5.f27991b == enumC5000a) {
                            return enumC5000a;
                        }
                        return y.f36177a;
                    }
                    N.B0(obj);
                    a10 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_id ON DBMessage(id)", null);
                    this.f20823Y = 4;
                    if (a10.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    a5 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                    this.f20823Y = 5;
                    if (a5.f27991b == enumC5000a) {
                    }
                    return y.f36177a;
                }
                N.B0(obj);
                a11 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX conversation_id ON DBConversation(id)", null);
                this.f20823Y = 3;
                if (a11.f27991b == enumC5000a) {
                    return enumC5000a;
                }
                a10 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_id ON DBMessage(id)", null);
                this.f20823Y = 4;
                if (a10.f27991b == enumC5000a) {
                }
                a5 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
                this.f20823Y = 5;
                if (a5.f27991b == enumC5000a) {
                }
                return y.f36177a;
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            a13 = ((C2801i) abstractC2597f).a(null, "CREATE TABLE DBConversation (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversation TEXT NOT NULL\n)", null);
            this.f20823Y = 1;
            if (a13.f27991b == enumC5000a) {
                return enumC5000a;
            }
        }
        a12 = ((C2801i) abstractC2597f).a(null, "CREATE TABLE DBMessage (\n    id TEXT NOT NULL PRIMARY KEY,\n    conversationId TEXT NOT NULL,\n    messageNode TEXT NOT NULL,\n    FOREIGN KEY (conversationId)\n       REFERENCES DBConversation (id)\n       ON DELETE CASCADE\n       ON UPDATE RESTRICT\n)", null);
        this.f20823Y = 2;
        if (a12.f27991b == enumC5000a) {
            return enumC5000a;
        }
        a11 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX conversation_id ON DBConversation(id)", null);
        this.f20823Y = 3;
        if (a11.f27991b == enumC5000a) {
        }
        a10 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_id ON DBMessage(id)", null);
        this.f20823Y = 4;
        if (a10.f27991b == enumC5000a) {
        }
        a5 = ((C2801i) abstractC2597f).a(null, "CREATE INDEX message_conversation_id ON DBMessage(conversationId)", null);
        this.f20823Y = 5;
        if (a5.f27991b == enumC5000a) {
        }
        return y.f36177a;
    }
}
