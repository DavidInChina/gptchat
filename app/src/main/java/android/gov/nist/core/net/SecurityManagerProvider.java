package android.gov.nist.core.net;

import java.util.Properties;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* loaded from: classes2.dex */
public interface SecurityManagerProvider {
    KeyManager[] getKeyManagers(boolean z10);

    TrustManager[] getTrustManagers(boolean z10);

    void init(Properties properties);
}
