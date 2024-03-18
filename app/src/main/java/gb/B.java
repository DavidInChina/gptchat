package gb;

import id.AbstractC3557B;
import te.C5760d;
import xe.AbstractC6407L;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31352Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f31353Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31354h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, wf.k kVar) {
        super(1);
        this.f31353Z = str;
        this.f31354h0 = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f31352Y;
        wf.k kVar = this.f31354h0;
        String str = this.f31353Z;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                AbstractC3557B.c0("it", str2);
                kVar.invoke(new O(str, str2));
                return yVar;
            default:
                C5760d c5760d = (C5760d) obj;
                AbstractC3557B.c0("$this$wss", c5760d);
                AbstractC6407L.b(c5760d.f46125a, str);
                kVar.invoke(c5760d);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(wf.k kVar, String str) {
        super(1);
        this.f31354h0 = kVar;
        this.f31353Z = str;
    }
}
