package R5;

import Me.d;
import Me.j;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import jf.y;
import kotlin.jvm.internal.o;
import nb.C4807b;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f15050Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj) {
        super(0);
        this.f15049Y = i10;
        this.f15050Z = obj;
    }

    public final d a() {
        int i10 = this.f15049Y;
        Object obj = this.f15050Z;
        switch (i10) {
            case 9:
                byte[] bArr = (byte[]) obj;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, bArr.length);
                AbstractC3557B.b0("wrap(array, offset, length)", wrap);
                j jVar = new j(wrap, new C4807b(1, bArr));
                Ne.c cVar = (Ne.c) jVar.C();
                cVar.f12024d = 0;
                cVar.f12022b = 0;
                cVar.f12023c = cVar.f12026f;
                long j6 = 0;
                Ne.c cVar2 = cVar;
                do {
                    j6 += cVar2.f12023c - cVar2.f12022b;
                    cVar2 = cVar2.i();
                } while (cVar2 != null);
                return new d(cVar, j6, jVar);
            default:
                return ((d) obj).V();
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f15049Y;
        Object obj = this.f15050Z;
        switch (i10) {
            case 0:
                return mo122invoke();
            case 1:
                return mo122invoke();
            case 2:
                return mo122invoke();
            case 3:
                return mo122invoke();
            case 4:
                return mo122invoke();
            case 5:
                return mo122invoke();
            case 6:
                return mo122invoke();
            case 7:
                return mo122invoke();
            case 8:
                return mo122invoke();
            case 9:
                return a();
            case 10:
                return a();
            case 11:
                ((d) obj).close();
                return y.f36177a;
            default:
                return obj;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f15049Y;
        Object obj = this.f15050Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
            case 1:
                return String.format(Locale.US, "Logs feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{obj.getClass().getCanonicalName()}, 1));
            case 2:
                return String.format(Locale.US, "Logs feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{((Map) obj).get("type")}, 1));
            case 3:
                return String.format(Locale.US, "RUM feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{obj.getClass().getCanonicalName()}, 1));
            case 4:
                return String.format(Locale.US, "RUM feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{((Map) obj).get("type")}, 1));
            case 5:
                return String.format(Locale.US, "RumEventMapper: there was no EventMapper assigned for RUM event type: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
            case 6:
                return String.format(Locale.US, "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s", Arrays.copyOf(new Object[]{obj}, 1));
            case 7:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{obj}, 1));
            default:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{obj}, 1));
        }
    }
}
