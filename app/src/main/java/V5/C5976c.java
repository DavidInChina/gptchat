package v5;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: v5.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5976c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47259Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f47260Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f47261h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5976c(int i10, String str, String str2) {
        super(0);
        this.f47259Y = i10;
        this.f47260Z = str;
        this.f47261h0 = str2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f47259Y;
        String str = this.f47261h0;
        String str2 = this.f47260Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"", Arrays.copyOf(new Object[]{str2, str}, 2));
            case 1:
                return String.format(Locale.US, "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.", Arrays.copyOf(new Object[]{str2, str}, 2));
            default:
                return "tag \"" + str2 + "\" was modified to \"" + str + "\" to match our constraints.";
        }
    }
}
