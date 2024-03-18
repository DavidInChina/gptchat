package r8;

import A.AbstractC0044t0;
import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: r8.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5377f {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f44471a = new HashMap();

    static {
        new HashSet(Arrays.asList("native", "unity"));
        AbstractC0044t0.y("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (AbstractC5377f.class) {
            hashMap = f44471a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
        }
        if (hashMap.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
        }
        return bundle;
    }
}
