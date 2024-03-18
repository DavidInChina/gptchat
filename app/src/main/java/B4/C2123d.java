package b4;

import G0.C0571a;
import d4.AbstractC2597f;
import d4.C2595d;
import e4.C2801i;

/* renamed from: b4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2123d extends AbstractC2122c {

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC2597f f25619c;

    /* renamed from: b  reason: collision with root package name */
    public final int f25618b = -41583637;

    /* renamed from: d  reason: collision with root package name */
    public final String f25620d = "Conversation.sq";

    /* renamed from: e  reason: collision with root package name */
    public final String f25621e = "getAll";

    /* renamed from: f  reason: collision with root package name */
    public final String f25622f = "SELECT conversation\nFROM DBConversation";

    public C2123d(String[] strArr, AbstractC2597f abstractC2597f, C0571a c0571a) {
        super(c0571a);
        this.f25619c = abstractC2597f;
    }

    public final C2595d a(C0571a c0571a) {
        return ((C2801i) this.f25619c).i(Integer.valueOf(this.f25618b), this.f25622f, c0571a, 0, null);
    }

    public final String toString() {
        return this.f25620d + ':' + this.f25621e;
    }
}
