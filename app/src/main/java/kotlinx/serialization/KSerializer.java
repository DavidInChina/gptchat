package kotlinx.serialization;

import ah.AbstractC1991b;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public interface KSerializer extends AbstractC1991b {
    void serialize(Encoder encoder, Object obj);
}
