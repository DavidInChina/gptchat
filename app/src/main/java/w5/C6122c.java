package w5;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: w5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6122c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48020Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f48021Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6122c(Map.Entry entry, int i10) {
        super(0);
        this.f48020Y = i10;
        this.f48021Z = entry;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f48020Y;
        Map.Entry entry = this.f48021Z;
        switch (i10) {
            case 0:
                return Separators.DOUBLE_QUOTE + entry + "\" is an invalid attribute, and was ignored.";
            case 1:
                return Separators.DOUBLE_QUOTE + entry + "\" key was in the reservedKeys set, and was dropped.";
            case 2:
                return String.format(Locale.US, "Error serializing value for key %s, value was dropped.", Arrays.copyOf(new Object[]{entry.getKey()}, 1));
            default:
                Object key = entry.getKey();
                return "Error converting value for key " + key + " to meta string, it will be dropped.";
        }
    }
}
