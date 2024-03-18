package livekit.org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import livekit.org.webrtc.EglBase;

/* loaded from: classes2.dex */
class MediaCodecVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "MediaCodecVideoDecoderFactory";
    private final Predicate<MediaCodecInfo> codecAllowedPredicate;
    private final EglBase.Context sharedContext;

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate<MediaCodecInfo> predicate) {
        this.sharedContext = context;
        this.codecAllowedPredicate = predicate;
    }

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        int i10 = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo = null;
            if (i10 >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i10);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "Cannot retrieve decoder codec info", e10);
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
            i10++;
        }
    }

    private boolean isCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate<MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        return false;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null) {
            return false;
        }
        return isCodecAllowed(mediaCodecInfo);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecMimeType valueOf = VideoCodecMimeType.valueOf(videoCodecInfo.getName());
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), findCodecForType.getName(), valueOf, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(valueOf.mimeType())).intValue(), this.sharedContext);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecMimeType[] videoCodecMimeTypeArr = {VideoCodecMimeType.VP8, VideoCodecMimeType.VP9, VideoCodecMimeType.H264, VideoCodecMimeType.AV1, VideoCodecMimeType.H265};
        for (int i10 = 0; i10 < 5; i10++) {
            VideoCodecMimeType videoCodecMimeType = videoCodecMimeTypeArr[i10];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecMimeType);
            if (findCodecForType != null) {
                String name = videoCodecMimeType.name();
                if (videoCodecMimeType == VideoCodecMimeType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecMimeType, true), new ArrayList()));
                }
                arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecMimeType, false), new ArrayList()));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
