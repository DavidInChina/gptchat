package d6;

import G5.i;
import id.AbstractC3557B;
import java.io.File;
import java.util.concurrent.ExecutorService;
import p5.AbstractC5091c;

/* loaded from: classes2.dex */
public final class g extends J5.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(File file, K5.a aVar, ExecutorService executorService, i iVar, G5.c cVar, AbstractC5091c abstractC5091c, G5.e eVar, int i10) {
        super(new H5.c(aVar, new J5.a(new File(new File(file, "ndk_crash_reports_intermediary_v2"), "network_information"), abstractC5091c), new J5.a(new File(new File(file, "ndk_crash_reports_v2"), "network_information"), abstractC5091c), new H5.a(cVar, abstractC5091c), executorService, abstractC5091c), new f8.e(0), iVar, abstractC5091c, eVar);
        if (i10 != 1) {
            AbstractC3557B.c0("consentProvider", aVar);
            AbstractC3557B.c0("internalLogger", abstractC5091c);
            return;
        }
        AbstractC3557B.c0("consentProvider", aVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        super(new H5.c(aVar, new J5.a(new File(new File(file, "ndk_crash_reports_intermediary_v2"), "user_information"), abstractC5091c), new J5.a(new File(new File(file, "ndk_crash_reports_v2"), "user_information"), abstractC5091c), new H5.a(cVar, abstractC5091c), executorService, abstractC5091c), new f8.e(1), iVar, abstractC5091c, eVar);
    }
}
