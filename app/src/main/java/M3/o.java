package M3;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import cf.AbstractC2408g;
import df.C2649n;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import livekit.org.webrtc.VideoCodecStatus;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoFrame;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11576a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11577b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11578c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f11579d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.f11576a = i10;
        this.f11578c = obj;
        this.f11579d = obj2;
        this.f11577b = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f11576a;
        Object obj = this.f11577b;
        Object obj2 = this.f11579d;
        Object obj3 = this.f11578c;
        switch (i10) {
            case 0:
                String str = (String) obj;
                WorkDatabase workDatabase = ((q) obj3).f11588e;
                ((ArrayList) obj2).addAll(workDatabase.v().B(str));
                return workDatabase.u().l(str);
            case 1:
                return v4.e.d((Context) obj3, (ZipInputStream) obj2, (String) obj);
            case 2:
                C2649n c2649n = (C2649n) obj3;
                VideoFrame videoFrame = (VideoFrame) obj2;
                VideoEncoder.EncodeInfo encodeInfo = (VideoEncoder.EncodeInfo) obj;
                AbstractC3557B.c0("this$0", c2649n);
                AbstractC3557B.c0("$frame", videoFrame);
                VideoEncoder.Settings settings = c2649n.f28286c;
                VideoEncoder videoEncoder = c2649n.f28284a;
                if (settings == null) {
                    return videoEncoder.encode(videoFrame, encodeInfo);
                }
                int width = videoFrame.getBuffer().getWidth();
                VideoEncoder.Settings settings2 = c2649n.f28286c;
                AbstractC3557B.Z(settings2);
                if (width == settings2.width) {
                    return videoEncoder.encode(videoFrame, encodeInfo);
                }
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                int width2 = buffer.getWidth();
                int height = buffer.getHeight();
                VideoEncoder.Settings settings3 = c2649n.f28286c;
                AbstractC3557B.Z(settings3);
                int i11 = settings3.width;
                VideoEncoder.Settings settings4 = c2649n.f28286c;
                AbstractC3557B.Z(settings4);
                VideoFrame.Buffer cropAndScale = buffer.cropAndScale(0, 0, width2, height, i11, settings4.height);
                VideoCodecStatus encode = videoEncoder.encode(new VideoFrame(cropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
                cropAndScale.release();
                return encode;
            default:
                C2649n c2649n2 = (C2649n) obj3;
                VideoEncoder.Settings settings5 = (VideoEncoder.Settings) obj2;
                VideoEncoder.Callback callback = (VideoEncoder.Callback) obj;
                AbstractC3557B.c0("this$0", c2649n2);
                AbstractC3557B.c0("$settings", settings5);
                AbstractC2408g.Companion.getClass();
                int b10 = AbstractC6708l.b(2, 7);
                VideoEncoder videoEncoder2 = c2649n2.f28284a;
                if (b10 >= 0 && Mi.a.d() > 0) {
                    Bi.c.N1("initEncode() thread=" + Thread.currentThread().getName() + " [" + Thread.currentThread().getId() + "]\n                |  encoder=" + videoEncoder2.getImplementationName() + "\n                |  streamSettings:\n                |    numberOfCores=" + settings5.numberOfCores + "\n                |    width=" + settings5.width + "\n                |    height=" + settings5.height + "\n                |    startBitrate=" + settings5.startBitrate + "\n                |    maxFramerate=" + settings5.maxFramerate + "\n                |    automaticResizeOn=" + settings5.automaticResizeOn + "\n                |    numberOfSimulcastStreams=" + settings5.numberOfSimulcastStreams + "\n                |    lossNotification=" + settings5.capabilities.lossNotification + "\n                        ");
                    Mi.a.c(new Object[0]);
                }
                return videoEncoder2.initEncode(settings5, callback);
        }
    }
}
