package kotlinx.serialization.encoding;

import ch.AbstractC2431b;
import gh.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Encoder {
    void D(String str);

    d a();

    AbstractC2431b c(SerialDescriptor serialDescriptor);

    void e();

    void g(double d10);

    void h(short s10);

    void j(byte b10);

    void k(boolean z10);

    void n(float f6);

    void o(char c10);

    AbstractC2431b s(SerialDescriptor serialDescriptor, int i10);

    void t(SerialDescriptor serialDescriptor, int i10);

    void u(int i10);

    Encoder v(SerialDescriptor serialDescriptor);

    void w(KSerializer kSerializer, Object obj);

    void y(long j6);
}
