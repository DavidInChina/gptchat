package K4;

import org.json.JSONObject;

/* renamed from: K4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818f {

    /* renamed from: a  reason: collision with root package name */
    public final String f9425a;

    public C0818f(String str) {
        this.f9425a = new JSONObject(str).optString("countryCode");
    }
}
