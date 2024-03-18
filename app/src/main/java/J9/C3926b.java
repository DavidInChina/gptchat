package j9;

import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import wf.k;

/* renamed from: j9.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3926b extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3926b f36079Z = new C3926b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3926b f36080h0 = new C3926b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f36081Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3926b(int i10) {
        super(1);
        this.f36081Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f36081Y;
        switch (i10) {
            case 0:
                V5.b bVar = (V5.b) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("$this$createLogger", bVar);
                        break;
                    default:
                        AbstractC3557B.c0("$this$createLogger", bVar);
                        bVar.f18400e = 0.2f;
                        break;
                }
                return yVar;
            default:
                V5.b bVar2 = (V5.b) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("$this$createLogger", bVar2);
                        break;
                    default:
                        AbstractC3557B.c0("$this$createLogger", bVar2);
                        bVar2.f18400e = 0.2f;
                        break;
                }
                return yVar;
        }
    }
}
