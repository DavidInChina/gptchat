package n9;

import G0.C0571a;
import b4.AbstractC2122c;
import d4.C2595d;
import e4.C2801i;
import s3.r;

/* loaded from: classes.dex */
public final class j extends AbstractC2122c {

    /* renamed from: b  reason: collision with root package name */
    public final String f39682b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f39683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, String str, r rVar) {
        super(rVar);
        this.f39683c = nVar;
        this.f39682b = str;
    }

    public final C2595d a(C0571a c0571a) {
        n nVar = this.f39683c;
        return ((C2801i) nVar.f25632a).i(561484614, "SELECT *\nFROM DBMessage\nWHERE conversationId = ?", c0571a, 1, new r(nVar, 13, this));
    }

    public final String toString() {
        return "Message.sq:getAllByConversationId";
    }
}
