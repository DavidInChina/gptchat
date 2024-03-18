package N;

import Mf.AbstractC0994c;
import Z.AbstractC1710f0;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import s5.C5576a;
import wf.AbstractC6216a;

/* renamed from: N.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12452Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f12453Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f12454h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1040y(int i10, Object obj, int i11) {
        super(0);
        this.f12452Y = i11;
        this.f12453Z = i10;
        this.f12454h0 = obj;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f12452Y;
        int i11 = this.f12453Z;
        Object obj = this.f12454h0;
        switch (i10) {
            case 0:
                return Integer.valueOf(((C1033q) obj).f12400f.g(i11));
            case 1:
                return mo122invoke();
            case 2:
                return mo122invoke();
            case 3:
                return mo122invoke();
            case 4:
                return (Float) ((List) obj).get(i11);
            case 5:
                switch (i10) {
                    case 5:
                        ((AbstractC1710f0) obj).setValue(Integer.valueOf(i11));
                        break;
                    default:
                        Hi.q.c((String) obj, i11);
                        break;
                }
                return yVar;
            case 6:
                Object obj2 = ((AbstractC0994c) obj).S().get(i11);
                AbstractC3557B.b0("get(...)", obj2);
                return (Mf.N) obj2;
            default:
                switch (i10) {
                    case 5:
                        ((AbstractC1710f0) obj).setValue(Integer.valueOf(i11));
                        break;
                    default:
                        Hi.q.c((String) obj, i11);
                        break;
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1040y(Object obj, int i10, int i11) {
        super(0);
        this.f12452Y = i11;
        this.f12454h0 = obj;
        this.f12453Z = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f12452Y;
        Object obj = this.f12454h0;
        int i11 = this.f12453Z;
        switch (i10) {
            case 1:
                String str = ((C5576a) obj).f45400b;
                return "Unexpected status code " + i11 + " on upload request: " + str;
            case 2:
                return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Long.valueOf(((F5.i) obj).f5053c.f6057c)}, 2));
            default:
                return String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Long.valueOf(((J5.b) obj).f8862e.f6057c)}, 2));
        }
    }
}
