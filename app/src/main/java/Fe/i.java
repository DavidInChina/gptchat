package Fe;

import Df.H;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final i f5326Z = new i(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final i f5327h0 = new i(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final i f5328i0 = new i(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final i f5329j0 = new i(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5330Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(1);
        this.f5330Y = i10;
    }

    public final q a(Map.Entry entry) {
        switch (this.f5330Y) {
            case 0:
                AbstractC3557B.c0("$this$$receiver", entry);
                return new q(((k) entry.getKey()).f5332a, entry.getValue());
            default:
                AbstractC3557B.c0("$this$$receiver", entry);
                return new q(H.s((String) entry.getKey()), entry.getValue());
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f5330Y) {
            case 0:
                return a((Map.Entry) obj);
            case 1:
                return a((Map.Entry) obj);
            case 2:
                k kVar = (k) obj;
                AbstractC3557B.c0("$this$$receiver", kVar);
                return kVar.f5332a;
            default:
                String str = (String) obj;
                AbstractC3557B.c0("$this$$receiver", str);
                return H.s(str);
        }
    }
}
