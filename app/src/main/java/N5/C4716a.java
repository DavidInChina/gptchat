package n5;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.auth0.android.request.internal.f;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4716a {

    /* renamed from: a  reason: collision with root package name */
    public final Map f39617a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39618b;

    public C4716a() {
        TextUtils.isEmpty("Auth0.Android");
        TextUtils.isEmpty("2.10.2");
        HashMap hashMap = new HashMap();
        hashMap.put("android", String.valueOf(Build.VERSION.SDK_INT));
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("auth0.android", null);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        AbstractC3557B.b0("unmodifiableMap(tmpEnv)", unmodifiableMap);
        this.f39617a = unmodifiableMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", "Auth0.Android");
        hashMap2.put(ParameterNames.VERSION, "2.10.2");
        hashMap2.put("env", unmodifiableMap);
        String i10 = f.f26731a.i(hashMap2);
        AbstractC3557B.b0("json", i10);
        Charset charset = StandardCharsets.UTF_8;
        AbstractC3557B.b0("UTF_8", charset);
        byte[] bytes = i10.getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        byte[] encode = Base64.encode(bytes, 10);
        AbstractC3557B.b0("encode(bytes, Base64.URL_SAFE or Base64.NO_WRAP)", encode);
        this.f39618b = new String(encode, charset);
    }
}
