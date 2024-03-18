package N;

import B0.C0198o;
import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12251Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f12252Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(kotlin.jvm.internal.x xVar, int i10) {
        super(1);
        this.f12251Y = i10;
        this.f12252Z = xVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f12251Y;
        kotlin.jvm.internal.x xVar = this.f12252Z;
        switch (i10) {
            case 0:
                if (((C1033q) obj).f12400f.f12477a.f12467a.f12512Y.length() > 0) {
                    xVar.f37645Y = false;
                }
                return yVar;
            case 1:
                if (((C0198o) obj).f1664u0) {
                    xVar.f37645Y = false;
                    return G0.x0.f5843h0;
                }
                return G0.x0.f5841Y;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                AbstractC3557B.c0("it", byteBuffer);
                if (byteBuffer.get(byteBuffer.position()) == 10) {
                    byteBuffer.position(byteBuffer.position() + 1);
                    xVar.f37645Y = true;
                }
                return yVar;
        }
    }
}
