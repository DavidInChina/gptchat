package w5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class d extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48022Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f48023Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f48024h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Map.Entry entry, String str, int i10) {
        super(0);
        this.f48022Y = i10;
        this.f48023Z = entry;
        this.f48024h0 = str;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f48022Y;
        String str = this.f48024h0;
        Map.Entry entry = this.f48023Z;
        switch (i10) {
            case 0:
                Object key = entry.getKey();
                return "Key \"" + key + "\" was modified to \"" + str + "\" to match our constraints.";
            default:
                return String.format(Locale.US, "Invalid timing name: %s, sanitized to: %s", Arrays.copyOf(new Object[]{entry.getKey(), str}, 2));
        }
    }
}
