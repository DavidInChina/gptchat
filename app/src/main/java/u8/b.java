package U8;

import E0.c0;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import jf.y;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f17514Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f17515h0 = new b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17516Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f17516Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f17516Y) {
            case 0:
                AbstractC3557B.c0("$this$layout", (c0) obj);
                return y.f36177a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("<name for destructuring parameter 0>", entry);
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                String v22 = Lg.n.v2("inline:", str);
                if (v22 == str) {
                    v22 = null;
                }
                if (v22 == null) {
                    return null;
                }
                AbstractC3557B.a0("null cannot be cast to non-null type com.halilibo.richtext.ui.string.InlineContent", value);
                return new C3959i(v22, (a) value);
        }
    }
}
