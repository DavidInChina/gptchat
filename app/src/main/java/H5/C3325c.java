package h5;

import android.text.TextUtils;
import g5.C3200b;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;

/* renamed from: h5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3325c extends C3200b {

    /* renamed from: Y  reason: collision with root package name */
    public String f31910Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f31911Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f31912h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map f31913i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3325c(String str, String str2) {
        this();
        AbstractC3557B.c0("code", str);
        this.f31910Y = str;
        this.f31911Z = str2;
    }

    public final String a() {
        String str = this.f31910Y;
        if (str != null) {
            AbstractC3557B.Z(str);
            return str;
        }
        return "a0.sdk.internal_error.unknown";
    }

    public final String b() {
        String str = this.f31911Z;
        if (!TextUtils.isEmpty(str)) {
            AbstractC3557B.Z(str);
            return str;
        } else if (AbstractC3557B.K("a0.sdk.internal_error.unknown", a())) {
            return String.format("Received error with code %s", Arrays.copyOf(new Object[]{a()}, 1));
        } else {
            return "Failed with unknown error";
        }
    }

    public C3325c() {
        super("An error occurred when trying to authenticate with the server.", null);
    }
}
