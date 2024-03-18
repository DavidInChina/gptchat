package Ze;

import Xe.EnumC1680b;
import bb.B0;
import id.AbstractC3557B;
import java.util.ArrayList;
import livekit.org.webrtc.CameraEnumerator;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f23707a;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e());
        arrayList.add(new Object());
        f23707a = arrayList;
    }

    public static String a(CameraEnumerator cameraEnumerator, wf.k kVar) {
        AbstractC3557B.c0("<this>", cameraEnumerator);
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        AbstractC3557B.b0("deviceNames", deviceNames);
        for (String str : deviceNames) {
            AbstractC3557B.b0("deviceName", str);
            if (((Boolean) kVar.invoke(str)).booleanValue()) {
                return str;
            }
        }
        return null;
    }

    public static String b(CameraEnumerator cameraEnumerator, String str, EnumC1680b enumC1680b) {
        String str2;
        AbstractC3557B.c0("<this>", cameraEnumerator);
        if (str != null) {
            str2 = a(cameraEnumerator, new B0(str, 11));
        } else {
            str2 = null;
        }
        if (str2 == null && enumC1680b != null) {
            str2 = a(cameraEnumerator, new Oc.c(cameraEnumerator, 18, enumC1680b));
        }
        if (str2 == null) {
            String[] deviceNames = cameraEnumerator.getDeviceNames();
            AbstractC3557B.b0("deviceNames", deviceNames);
            int length = deviceNames.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    String str3 = deviceNames[i10];
                    AbstractC3557B.b0("deviceName", str3);
                    if (Boolean.TRUE.booleanValue()) {
                        str2 = str3;
                        break;
                    }
                    i10++;
                } else {
                    str2 = null;
                    break;
                }
            }
        }
        if (str2 == null) {
            return null;
        }
        return str2;
    }
}
