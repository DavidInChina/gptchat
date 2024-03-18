package o6;

import java.util.Arrays;
import java.util.Locale;
import wd.C6167B;
import wd.C6168C;
import wf.AbstractC6216a;

/* renamed from: o6.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4929h extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40866Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f40867Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4929h(String str, int i10) {
        super(0);
        this.f40866Y = i10;
        this.f40867Z = str;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f40866Y;
        String str = this.f40867Z;
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
                return new x9.l(str);
            default:
                if (str == null) {
                    C6168C.Companion.getClass();
                    str = C6167B.a();
                }
                return new C6168C(str);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f40866Y;
        String str = this.f40867Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 1:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 2:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 3:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 4:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 5:
                return R.a.r("Error parsing source type from NDK crash event: ", str);
            case 6:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 7:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            default:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
        }
    }
}
